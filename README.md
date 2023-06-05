# crud

Работа API src/main/java/com/rating/crud/controller/StudentController.java 

Интерфейс для работы с api http://localhost:8080/swagger-ui/index.html


/get - получить всех студентов

/create создать студента

/update обновить студента

/delete/{id} удалить по id

БД MySQL
Нужно создать схему taskrest, а в ней таблицу:

CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `faculty` varchar(255) DEFAULT NULL,
  `course` varchar(255) DEFAULT NULL,
  `student_group` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

Миграции настроить не успел, поэтому БД необходимо создать самостоятельно
