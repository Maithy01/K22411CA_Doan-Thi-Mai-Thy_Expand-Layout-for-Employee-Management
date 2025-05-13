package com.tranduythanh.k22411casampleproject;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tranduythanh.models.Employee;
import com.tranduythanh.models.ListEmployee;

public class EmployeeManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_management);

        // Tạo danh sách mẫu
        ListEmployee listEmployee = new ListEmployee();
        listEmployee.generate_sample_dataset();

        // Gắn layout danh sách
        LinearLayout layout = findViewById(R.id.layoutEmployeeList);

        for (Employee e : listEmployee.getEmployees()) {
            TextView tv = new TextView(this);
            tv.setText(
                    "Tên: " + e.getName() + "\n" +
                            "Email: " + e.getEmail() + "\n" +
                            "Username: " + e.getUsername() + "\n" +
                            "Password: " + e.getPassword() + "\n" +
                            "----------------------------"
            );
            tv.setTextSize(16);
            tv.setPadding(0, 16, 0, 16);

            layout.addView(tv);
        }
    }
}