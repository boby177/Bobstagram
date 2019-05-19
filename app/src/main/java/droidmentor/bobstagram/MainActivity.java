/*  Tanggal Pengerjaan : 19 Mei 2019
    NIM   : 10116334
    Nama  : Boby Maulana Subagja
    Kelas : IF-8
 */

package droidmentor.bobstagram;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import droidmentor.bobstagram.Fragment.CallsFragment;
import droidmentor.bobstagram.Fragment.ChatFragment;
import droidmentor.bobstagram.Fragment.ContactsFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    //This is our viewPager
    private ViewPager viewPager;

    //Fragments

    ChatFragment chatFragment;
    CallsFragment callsFragment;
    ContactsFragment contactsFragment;
    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        //Initializing the bottomNavigationView
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_call:
                                viewPager.setCurrentItem(0);
                                break;
                            case R.id.action_chat:
                                viewPager.setCurrentItem(1);
                                break;
                            case R.id.action_contact:
                                viewPager.setCurrentItem(2);
                                break;
                        }
                        return false;
                    }
                });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page", "onPageSelected: "+position);
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        setupViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        callsFragment=new CallsFragment();
        chatFragment=new ChatFragment();
        contactsFragment=new ContactsFragment();
        adapter.addFragment(callsFragment);
        adapter.addFragment(chatFragment);
        adapter.addFragment(contactsFragment);
        viewPager.setAdapter(adapter);
    }
//Instagram
    public void pindah1(View view) {
        String url = "https://www.instagram.com/bob.m.s";
        Intent pindah1 = new Intent(Intent.ACTION_VIEW);
        pindah1.setData(Uri.parse(url));
        startActivity(pindah1);
    }
//Youtube
    public void pindah2(View view) {
        String url = "https://www.youtube.com/channel/UCqVfVB91wjNPWXGTdBqTIeg?sub_confirmation=1";
        Intent pindah2 = new Intent(Intent.ACTION_VIEW);
        pindah2.setData(Uri.parse(url));
        startActivity(pindah2);
    }
//About
public void pindah3(View view) {
    Intent intent = new Intent(MainActivity.this, About.class);
    startActivity(intent);
}
//Web
    public void pindah4 (View view) {
        String url = "https://ilmu-nation.blogspot.com";
        Intent pindah4 = new Intent(Intent.ACTION_VIEW);
        pindah4.setData(Uri.parse(url));
        startActivity(pindah4);
    }
//HP
    public void pindahHP(View view) {
    String nomor = "087847635406";
    Intent panggil = new Intent(Intent.ACTION_DIAL);
    panggil.setData(Uri.fromParts("tel",nomor, null));
    startActivity(panggil);
}
//Email
    public void pindahEmail (View view) {
        String url = "mailto:boby.ms37@gmail.com";
        Intent pindah4 = new Intent(Intent.ACTION_VIEW);
        pindah4.setData(Uri.parse(url));
        startActivity(pindah4);
    }
}
