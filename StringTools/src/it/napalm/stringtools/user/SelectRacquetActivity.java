package it.napalm.stringtools.user;

import java.text.ParseException;
import java.util.ArrayList;

import org.json.JSONException;

import it.napalm.stringtools.R;
import it.napalm.stringtools.adapter.RacquetAdapter;
import it.napalm.stringtools.globalobject.Racquet;
import it.napalm.stringtools.object.TblRacquets;
import it.napalm.stringtools.object.TblUsers;
import it.napalm.stringtools.utils.HttpFunctions;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SearchView;

public class SelectRacquetActivity extends Activity implements OnItemSelectedListener {

	private TblUsers customer;
	private ArrayList<Racquet> listRacquets;
	private HttpFunctions function;
	private ListView list;
	private RacquetAdapter adapter;
	private EditText inputSearch;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.racquet_list);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
	    StrictMode.setThreadPolicy(policy);
	    
	    function = new HttpFunctions();
	    Intent intent=getIntent();
	    customer = (TblUsers)intent.getSerializableExtra("customer");
	    
	    getActionBar().setTitle(getResources().getString(R.string.select_racquet_toadd));
	   
	    
	    new GetListRacquet().execute();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu_h, menu);

	    return super.onCreateOptionsMenu(menu);
	}
	
	
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case android.R.id.home:
	        	finish();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	private class GetListRacquet extends AsyncTask<Void, Void, Void> {
		 
		ProgressDialog pDialog;
		
	    @Override
	    protected void onPreExecute() {
	        super.onPreExecute();
	        pDialog = new ProgressDialog(SelectRacquetActivity.this);
	        pDialog.setMessage(getResources().getString(R.string.wait_load));
	        pDialog.setCancelable(false);
	        pDialog.show();
	 
	    }
	 
	    @Override
	    protected Void doInBackground(Void... arg0) {
	    	
	    	
	    	try {
	    		try {
	    			listRacquets = new ArrayList<Racquet>();
	    			ArrayList<TblRacquets> listTblRacquet = 
	    					function.getListRacquet(getResources().getString(R.string.URL), 0);
	    			
	    			for (TblRacquets item : listTblRacquet){
	    				Racquet racquet = new Racquet();
	    				racquet.setTblRacquets(item);
	    				racquet.setTblBrands(function.getBrands(getResources().getString(R.string.URL), item.getTblBrands()).get(0));
	    				racquet.setTblRacquetsPattern(function.getRacquetsPattern(getResources().getString(R.string.URL), item.getTblRacquetsPattern()).get(0));
	    				listRacquets.add(racquet);
	    			}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (NotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return null;
	    }
	 
	    @Override
	    protected void onPostExecute(Void result) {
	        super.onPostExecute(result);
	        if (pDialog.isShowing())
	            pDialog.dismiss();
	        
	        populateList();
	    }
	}
	
	private void populateList() {
		list = (ListView)findViewById(R.id.listRacquet);
		 
        adapter = new RacquetAdapter(SelectRacquetActivity.this, listRacquets);
        list.setAdapter(adapter);
 
        // Click event for single list row
        list.setOnItemClickListener(new OnItemClickListener() {
 

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				/*CustomerRacquet customerRacquet = listRacquet.get(arg2);
				Intent editCustomerRacquet = new Intent(CustomerRacquetActivity.this, EditCustomerRacquetActivity.class);
				editCustomerRacquet.putExtra("customerracquet", customerRacquet);
				editCustomerRacquet.putExtra("position", PositionMenu.CUSTOMERS_LIST_RACQUET);
				startActivityForResult(editCustomerRacquet, MOD_DATA_RACQUET);*/
			}
        });
	}


}
