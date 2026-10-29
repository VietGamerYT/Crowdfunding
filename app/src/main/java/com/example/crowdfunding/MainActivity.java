package com.example.crowdfunding;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Nạp giao diện Đăng nhập
        setContentView(R.layout.activity_login);

        // Tìm nút Đăng nhập dựa vào ID đã đặt trong file activity_login.xml
        MaterialButton btnLogin = findViewById(R.id.btnLogin);

        // Bắt sự kiện khi người dùng bấm vào nút
        btnLogin.setOnClickListener(view -> {
            // Hiển thị một thông báo nổi nhỏ trên màn hình
            Toast.makeText(MainActivity.this, "Giao diện TV3 thiết kế đã nhận Click! Đang chờ TV1 ráp code...", Toast.LENGTH_SHORT).show();
        });
    }
}