package com.eduarve.currencyconverter;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.eduarve.currencyconverter.R;
import com.eduarve.currencyconverter.rest.Data;
import com.eduarve.currencyconverter.utils.Globals;
import com.eduarve.currencyconverter.utils.Numero;
import com.eduarve.currencyconverter.utils.Prefs;
import com.eduarve.currencyconverter.utils.RelativeLayoutTouchListener;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static TextView date, currencyTitle, countryTo, countryFrom, currencyFromName, currencyToName;
    public static int flag;
    public static EditText currency_from;
    public static TextView currency_to, fromLetters, toLetters;
    Typeface tfRegular, tfThin;
    public static ImageView arrowDown, arrowUp;
    public static BottomSheetBehavior behavior;
    RecyclerView recyclerView;
    CurrencyAdapter mAdapter;
    ArrayList items = new ArrayList();
    LinearLayout linearLayoutOne, linearLayoutTwo, mainLayout;
    public static RelativeLayout relativeOne, relativeTwo;
    Calendar calendar;
    int screenHeight = 0;
    public static EditText search;
    CardView interchange;
    public static Context ctx;
    public static View line;
    private InterstitialAd interstitialAd;

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hiding the status bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        initialize();

        ctx = getApplicationContext();

        try {
            if(!(Prefs.getPrefs("country_from",MainActivity.this).equals("notfound"))){
                countryFrom.setText(Prefs.getPrefs("country_from",MainActivity.this));
            }else {
                countryFrom.setText("VES");
            }
            String name  = Globals.getCountryCurrencyName(countryFrom.getText().toString());
            if (!name.equals("")) {
                currencyFromName.setText(name);
            } else {
                currencyFromName.setText("");
            }

            if(!(Prefs.getPrefs("country_to",MainActivity.this).equals("notfound"))){
                countryTo.setText(Prefs.getPrefs("country_to",MainActivity.this));
            }else {
                countryTo.setText("PTR");
            }
            name  = Globals.getCountryCurrencyName(countryTo.getText().toString());
            if (!name.equals("")) {
                currencyToName.setText(name);
            } else {
                currencyToName.setText("");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        fromLetters.setText("");
        toLetters.setText("");

        screenHeight = getScreenHeight();

        /**
         * configuracion para el admob
         */

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-1526916643110648~7262697250");
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId( getResources().getString(R.string.id_intertial_ads));
       // interstitialAd.setAdUnitId("ca-app-pub-1526916643110648/6381269542");

        AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice("4C8CDAC69582FC28EA74BBC70991F17D")
                .build();

        interstitialAd.loadAd(adRequest);

        currencyApi(MainActivity.this);

        Globals.getCountryCode(MainActivity.this);

        //inflating bottom sheet
        final LinearLayout bottomSheet = (LinearLayout) findViewById(R.id.bottom_sheet);
        bottomSheet.getLayoutParams().height = getScreenHeight() - 100;
        behavior = BottomSheetBehavior.from(bottomSheet);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //TODO fill the list
        mAdapter = new CurrencyAdapter(MainActivity.this, Globals.NEWcountryCode, Globals.NEWcountriesCurrencies);
        recyclerView.setAdapter(mAdapter);

        behavior.setPeekHeight(0);



        //Setting click listeners on arrows
        linearLayoutOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 1;
                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);

                InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(linearLayoutOne.getWindowToken(), 0);
//                behavior.setPeekHeight(screenHeight/2);
            }
        });
        linearLayoutTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 2;
                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(linearLayoutTwo.getWindowToken(), 0);
            }
        });

        relativeOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                behavior.setPeekHeight(0);
            }
        });
        relativeTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                behavior.setPeekHeight(0);
            }
        });

        interchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempFrom = String.valueOf(countryFrom.getText());
                countryFrom.setText(countryTo.getText());
                countryTo.setText(tempFrom);

                tempFrom = String.valueOf(currency_from.getText());
                currency_from.setText(currency_to.getText());
                currency_to.setText(tempFrom);

                String name  = Globals.getCountryCurrencyName(countryFrom.getText().toString());
                if (!name.equals("")) {
                    currencyFromName.setText(name);
                } else {
                    currencyFromName.setText("");
                }

                name  = Globals.getCountryCurrencyName(countryTo.getText().toString());
                if (!name.equals("")) {
                    currencyToName.setText(name);
                } else {
                    currencyToName.setText("");
                }

                if (interstitialAd.isLoaded()) {
                    interstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

            }
        });

        relativeOne.setOnTouchListener(new RelativeLayoutTouchListener(this));

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s != null) {
                    mAdapter.filter(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        currency_from.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s != null && s.length() > 0) {
                    String value = Globals.convertCurrency(countryFrom.getText().toString(), countryTo.getText().toString(), s.toString());
                    currency_to.setText(value.toString());

                    if (!countryFrom.getText().toString().equals("PTR"))
                        fromLetters.setText(Numero.enLetras(BigDecimal.valueOf(Double.parseDouble(s.toString()))));
                    else
                        fromLetters.setText("");

                    if (countryTo.getText() != null && !countryTo.getText().toString().equals("PTR"))
                        toLetters.setText(Numero.enLetras(BigDecimal.valueOf(Double.parseDouble(value.toString()))));
                    else
                        toLetters.setText("");
                }else {
                    currency_to.setText("");
                    fromLetters.setText("");
                    toLetters.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        relativeOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(relativeOne.getWindowToken(), 0);
            }
        });


    }


    private int getScreenHeight() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        Log.d(TAG, "getScreenHeight: " + height);
        return height;
    }


    private void initialize() {

        date = (TextView) findViewById(R.id.date);
        currencyTitle = (TextView) findViewById(R.id.currency_title);
        arrowDown = (ImageView) findViewById(R.id.down_arrow);
        arrowUp = (ImageView) findViewById(R.id.up_arrow);
        countryTo = (TextView) findViewById(R.id.country_to);
        countryFrom = (TextView) findViewById(R.id.country_from);
        fromLetters  = (TextView) findViewById(R.id.fromLetters);
        toLetters  = (TextView) findViewById(R.id.toLetters);
        currencyFromName = (TextView) findViewById(R.id.country_from_currency_name);
        currencyToName = (TextView) findViewById(R.id.country_to_currency_name);

        interchange = (CardView) findViewById(R.id.interchange);

        currency_from = (EditText) findViewById(R.id.currency_from_et);
        currency_to = (TextView) findViewById(R.id.currency_to_et);

        line = findViewById(R.id.txt_line);

        search = (EditText) findViewById(R.id.search);

        date.setText(getCurrentMonth().substring(0, 3) + " " + getCurrentDate() + "," + getCurrentYear());

        relativeOne = (RelativeLayout) findViewById(R.id.relative_1);
        relativeTwo = (RelativeLayout) findViewById(R.id.relative_2);
        linearLayoutOne = (LinearLayout) findViewById(R.id.linearll_1);
        linearLayoutTwo = (LinearLayout) findViewById(R.id.linearll_2);
        mainLayout = (LinearLayout) findViewById(R.id.maine_linear_layout);

        tfRegular = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/OpenSans-Regular.ttf");
        tfRegular = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/Raleway-ExtraLight.ttf");
        date.setTypeface(tfRegular);
        currencyTitle.setTypeface(tfRegular);
        countryTo.setTypeface(tfThin);
        countryFrom.setTypeface(tfThin);

        hideKeyboard(findViewById(R.id.relative_1));
        hideKeyboard(findViewById(R.id.relative_2));
        hideKeyboard(findViewById(R.id.interchange));

        ColorStateList csl = AppCompatResources.getColorStateList(this, R.color.blue);
        Drawable drawableone = getResources().getDrawable(R.drawable.ic_keyboard_arrow_down);
        DrawableCompat.setTintList(drawableone, csl);
        arrowDown.setImageDrawable(drawableone);
    }


    public void currencyApi(Activity activity) {
        Data.getCurrency(activity, new Data.UpdateCallback() {
            @Override
            public void onUpdate() {
                Log.d("tagg", "success api");
            }

            @Override
            public void onFailure() {
                Log.d("tagg", "fail api");
            }
        });
    }

    private String getCurrentDate() {
        calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = mdformat.format(calendar.getTime());
        String date = strDate.substring(0, 2);
        return date;
    }

    private String getCurrentMonth() {
        DateFormat dateFormat = new SimpleDateFormat("MM");
        Date date = new Date();
        String month = (dateFormat.format(date));
        String currMonth = null;
        if (month.equals("01")) {
            currMonth = "January";
        } else if (month.equals("02")) {
            currMonth = "February";
        } else if (month.equals("03")) {
            currMonth = "March";
        } else if (month.equals("04")) {
            currMonth = "April";
        } else if (month.equals("05")) {
            currMonth = "May";
        } else if (month.equals("06")) {
            currMonth = "June";
        } else if (month.equals("07")) {
            currMonth = "July";
        } else if (month.equals("08")) {
            currMonth = "August";
        } else if (month.equals("09")) {
            currMonth = "September";
        } else if (month.equals("10")) {
            currMonth = "October";
        } else if (month.equals("11")) {
            currMonth = "November";
        } else if (month.equals("12")) {
            currMonth = "December";
        }
        return currMonth;
    }

    private String getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = mdformat.format(calendar.getTime());
        String year = strDate.substring(0, 4);
        return year;
    }

    private void hideKeyboard(View root) {
        root.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    View view = v.getRootView().findFocus();
                    if (view != null) {
                        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    }
                    return false;
                }
                return false;
            }
        });
    }
}
