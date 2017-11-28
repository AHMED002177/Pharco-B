package COM.SALARY.HR;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.ClipboardManager;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;



public class MainActivity extends Activity {

	private LinearLayout linear4;
	private LinearLayout linear9;
	private LinearLayout linear13;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private Button button1;
	private TextView adarwesh;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView textview1;
	private EditText salary;
	private TextView textview2;
	private EditText wardya;
	private TextView textview3;
	private EditText holiday;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private TextView textview4;
	private EditText fraiday;
	private TextView textview5;
	private EditText night;
	private TextView textview6;
	private EditText day;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private TextView textview7;
	private EditText saturday;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private TextView textview11;
	private TextView nday;
	private TextView textview10;
	private TextView dwar;
	private TextView textview9;
	private TextView hour;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private TextView textview14;
	private TextView all;
	private TextView textview13;
	private TextView allwar;
	private TextView textview12;
	private TextView nnight;





	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		button1 = (Button) findViewById(R.id.button1);
		adarwesh = (TextView) findViewById(R.id.adarwesh);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview1 = (TextView) findViewById(R.id.textview1);
		salary = (EditText) findViewById(R.id.salary);
		textview2 = (TextView) findViewById(R.id.textview2);
		wardya = (EditText) findViewById(R.id.wardya);
		textview3 = (TextView) findViewById(R.id.textview3);
		holiday = (EditText) findViewById(R.id.holiday);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview4 = (TextView) findViewById(R.id.textview4);
		fraiday = (EditText) findViewById(R.id.fraiday);
		textview5 = (TextView) findViewById(R.id.textview5);
		night = (EditText) findViewById(R.id.night);
		textview6 = (TextView) findViewById(R.id.textview6);
		day = (EditText) findViewById(R.id.day);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview7 = (TextView) findViewById(R.id.textview7);
		saturday = (EditText) findViewById(R.id.saturday);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview11 = (TextView) findViewById(R.id.textview11);
		nday = (TextView) findViewById(R.id.nday);
		textview10 = (TextView) findViewById(R.id.textview10);
		dwar = (TextView) findViewById(R.id.dwar);
		textview9 = (TextView) findViewById(R.id.textview9);
		hour = (TextView) findViewById(R.id.hour);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview14 = (TextView) findViewById(R.id.textview14);
		all = (TextView) findViewById(R.id.all);
		textview13 = (TextView) findViewById(R.id.textview13);
		allwar = (TextView) findViewById(R.id.allwar);
		textview12 = (TextView) findViewById(R.id.textview12);
		nnight = (TextView) findViewById(R.id.nnight);


		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
			  int salary = i;
			  if (i = null)
			salary.settext("0")
				dwar.setText(String.valueOf(Double.parseDouble(salary.getText().toString()) * 0.03d));
				hour.setText(String.valueOf(Double.parseDouble(salary.getText().toString()) / 210));
				nday.setText(String.valueOf(Double.parseDouble(day.getText().toString()) * 1.5d));
				nnight.setText(String.valueOf((Double.parseDouble(night.getText().toString()) * 4) + (Double.parseDouble(day.getText().toString()) * 2)));
				allwar.setText(String.valueOf(Double.parseDouble(wardya.getText().toString()) * Double.parseDouble(dwar.getText().toString())));
				all.setText(String.valueOf(((((Double.parseDouble(nday.getText().toString()) * 1.3d) + (Double.parseDouble(nnight.getText().toString()) * 1.7d)) + (Double.parseDouble(holiday.getText().toString()) * 16)) * Double.parseDouble(hour.getText().toString())) + Double.parseDouble(allwar.getText().toString())));
			}
		});

	}

	private void  initializeLogic() {
		showMessage("برجاء ادخال كل البيانات فوق");
		textview4.setVisibility(View.INVISIBLE);
		textview7.setVisibility(View.INVISIBLE);
		fraiday.setVisibility(View.INVISIBLE);
		saturday.setVisibility(View.INVISIBLE);
	}






	// created automatically
	private void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}

	private int getRandom(int _minValue ,int _maxValue){
		Random random = new Random();
		return random.nextInt(_maxValue - _minValue + 1) + _minValue;
	}

	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
				_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}

	private float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}

	private int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}

	private int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}


}
