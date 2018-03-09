package nyc.c4q.simplemvp;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements Contractor{

    SecondFragment secondFragment= new SecondFragment();
    private String userInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container, new BaseFragment())
                .commit();

        FragmentManager fragmentManager1= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1= fragmentManager1.beginTransaction();
        fragmentTransaction1.replace(R.id.container_two, new SecondFragment())
                .commit();
    }

    @Override
    public void sendInput(String input) {
        Log.d("sendInput: ", "" + input);
//        userInput=input;
        secondFragment.receiveUserInput(input);
    }

    @Override
    public void sendResult(String result) {

    }

    public String getUserInput() {
        return userInput;
    }
}
