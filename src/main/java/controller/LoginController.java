package controller;

import dao.UserDao;
import javax.swing.JOptionPane;
import model.User;
import view.LoginView;
import view.LoginViewFrame;

public class LoginController {
    private LoginViewFrame loginView;
    private UserDao userDAO = new UserDao();

    public LoginController(LoginViewFrame view) {
        this.loginView = view;
        // Đăng ký sự kiện nhấn nút Login
        this.loginView.btnLogin.addActionListener(e -> login());
    }

    private void login() {
        // Lấy dữ liệu người dùng nhập từ View
        String username = loginView.et_username.getText();
        String password = new String(loginView.et_password.getText());

        // Tạo đối tượng User model để chuyển dữ liệu
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // Gọi UserDAO kiểm tra đăng nhập
        if (userDAO.checkLogin(user)) {
            JOptionPane.showMessageDialog(null, "Login successful!");
            // Nếu đúng, mở giao diện quản lý sản phẩm
//            new ProductController(new ProductView());
            // Đóng giao diện login
            loginView.dispose();
        } else {
            // Nếu sai, báo lỗi
            JOptionPane.showMessageDialog(null, "Invalid credentials!");
        }
    }
}
