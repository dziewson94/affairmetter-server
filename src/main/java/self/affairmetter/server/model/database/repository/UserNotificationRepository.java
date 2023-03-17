package self.affairmetter.server.model.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import self.affairmetter.server.model.database.entity.UserNotification;

public interface UserNotificationRepository extends JpaRepository<UserNotification,Integer> {
}
