package com.kebii.livedataviewmodelapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kebii.livedataviewmodelapp.databinding.ActivityMainBinding;
import com.kebii.livedataviewmodelapp.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {

    User user;
    String[] names = new String[]{"张三","王五","李四","小强"};
    int tag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_user);

        ActivityUserBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_user);
        user = new User("张三","123456","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1541069934582&di=ae66155eb7cad0d71baa82498539fc52&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201411%2F23%2F20141123205812_Bircn.jpeg");
        binding.setUser(user);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_change_data:
                tag++;
                if (tag >= names.length) {
                    tag = 0;
                }
                user.setName(names[tag]);
                break;
        }
    }
}
