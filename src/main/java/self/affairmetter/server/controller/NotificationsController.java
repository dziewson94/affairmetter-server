package self.affairmetter.server.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import self.affairmetter.server.model.database.entity.UserNotification;
import self.affairmetter.server.model.database.repository.UserNotificationRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NotificationsController {

    private List<UserNotification> notifications = new ArrayList<>();
    @Autowired
    private UserNotificationRepository userNotificationRepository;
    @RequestMapping("/")
    public String index(Model model) {


        model.addAttribute("notifs", notifications);


        return "index";
    }

    @PostMapping(
            value = "/postNotification", consumes = "application/json", produces = "application/json")
    public void postNotification(@RequestBody String userNotifications, HttpServletResponse response) {
//        notifications.add(userNotification);
    //    userNotificationRepository.save(userNotification);
        System.out.println(userNotifications);
    }
}
