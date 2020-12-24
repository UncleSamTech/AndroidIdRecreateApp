package com.androididrecreate.easyandroidid;

import android.media.Rating;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Toolbar;
import android.widget.VideoView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.utils.widget.ImageFilterButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.utils.widget.MockView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

public class AndroidUISamClass {

    public TextView getTv(int id, View v){
        return v.findViewById(id);
    }

    public ImageView getImg(int id, View v){
        return v.findViewById(id);

    }

    public Button getBut(int id, View v){
        return v.findViewById(id);
    }

    public ImageButton getImgBut(int id, View v){
        return v.findViewById(id);
    }

    public ChipGroup getChipGrp(int id, View v){
        return v.findViewById(id);

    }

    public Chip getChip(int id, View v){
        return v.findViewById(id);
    }

    public CheckBox getChkBox(int id, View v){
        return v.findViewById(id);
    }

    public RadioGroup getRadGrp(int id, View v){
        return v.findViewById(id);

    }

    public RadioButton getRadBut(int id, View v){
        return v.findViewById(id);
    }




    public ToggleButton getTogBut(int id, View v){
        return v.findViewById(id);
    }

    public Switch getSw(int id, View v){
        return v.findViewById(id);

    }

    public FloatingActionButton getFlAB(int id, View v){
        return v.findViewById(id);
    }

    public View getVie(int id, View v){
        return v.findViewById(id);
    }

    public WebView getWebView(int id, View v){
        return v.findViewById(id);

    }

    public VideoView getVidVie(int id, View v){
        return v.findViewById(id);
    }

    public CalendarView getCalView(int id, View v){
        return v.findViewById(id);
    }

    public ProgressBar getProgBar(int id, View v){
        return v.findViewById(id);

    }

    public SeekBar getSeek(int id, View v){
        return v.findViewById(id);
    }





    public RatingBar getRBar(int id, View v){
        return v.findViewById(id);
    }

    public SearchView getSView(int id, View v){
        return v.findViewById(id);

    }

    public TextureView getTextuView(int id, View v){
        return v.findViewById(id);
    }

    public SurfaceView getSurfView(int id, View v){
        return v.findViewById(id);
    }

    public ConstraintLayout getConsLay(int id, View v){
        return v.findViewById(id);

    }

    public LinearLayout getLinLay(int id, View v){
        return v.findViewById(id);
    }

    public RelativeLayout getRelLay(int id, View v){
        return v.findViewById(id);
    }

    public FrameLayout getFraLay(int id, View v){
        return v.findViewById(id);

    }

    public GridLayout getGrdLay(int id, View v){
        return v.findViewById(id);
    }




    public TableLayout getTabLay(int id, View v){
        return v.findViewById(id);
    }

    public TableRow getTabRow(int id, View v){
        return v.findViewById(id);

    }

    public Space getSpace(int id, View v){
        return v.findViewById(id);
    }

    public Spinner getSpin(int id, View v){
        return v.findViewById(id);
    }

    public ScrollView getScrView(int id, View v){
        return v.findViewById(id);

    }

    public HorizontalScrollView getHorScrView(int id, View v){
        return v.findViewById(id);
    }

    public NestedScrollView getNesScrlView(int id, View v){
        return v.findViewById(id);
    }

    public ViewPager getViewPag(int id, View v){
        return v.findViewById(id);

    }

    public CardView getCardVie(int id, View v){
        return v.findViewById(id);
    }






    public AppBarLayout getAppBarLay(int id, View v){
        return v.findViewById(id);

    }

    public BottomAppBar getBotAppBar(int id, View v){
        return v.findViewById(id);
    }

    public NavigationView getNavView(int id, View v){
        return v.findViewById(id);
    }

    public BottomNavigationView getBotNavView(int id, View v){
        return v.findViewById(id);

    }

    public BottomNavigationItemView getBotNavItemView(int id, View v){
        return v.findViewById(id);
    }

        public Toolbar getToolBar(int id, View v){
        return v.findViewById(id);
    }

    public ViewStub getViewStb(int id, View v){
        return v.findViewById(id);

    }

    public TabItem getTabItem(int id, View v){
        return v.findViewById(id);
    }




    public Group getGrp(int id, View v){
        return v.findViewById(id);
    }

    public Barrier getBarr(int id, View v){
        return v.findViewById(id);

    }

    public Flow getFlow(int id, View v){
        return v.findViewById(id);
    }

    public Layer getLayer(int id, View v){
        return v.findViewById(id);
    }

    public ImageFilterView getImgFilterView(int id, View v){
        return v.findViewById(id);

    }

    public ImageFilterButton getImgFiltButton(int id, View v){
        return v.findViewById(id);
    }

    public MockView getMockView(int id, View v){
        return v.findViewById(id);
    }

    public ListView getLisView(int id, View v){
        return v.findViewById(id);

    }

    public GridView getGridVie(int id, View v){
        return v.findViewById(id);
    }

}
