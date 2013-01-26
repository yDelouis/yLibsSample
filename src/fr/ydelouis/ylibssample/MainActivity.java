package fr.ydelouis.ylibssample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import fr.ydelouis.aftvsample.AutoFitTextViewDemoActivity;
import fr.ydelouis.stdlvsample.SwipeToDeleteListViewDemoActivity;
import fr.ydelouis.universaladaptersample.UAADemoActivity;

public class MainActivity
		extends ListActivity
{
	private static final String[] samples = {"AutoFitTextView", "SwipeToDeleteListView", "UniversalAdapter"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, samples));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Class<?> activityClass = null;
		switch(position) {
			case 0:
				activityClass = AutoFitTextViewDemoActivity.class;
				break;
			case 1:
				activityClass = SwipeToDeleteListViewDemoActivity.class;
				break;
			case 2:
				activityClass = UAADemoActivity.class;
				break;
		}
		if(activityClass != null)
			startActivity(new Intent(this, activityClass));
	}
}
