import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void simpleTaskMatchesTest1() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void simpleTaskMatchesTest2() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Ответить");

        Assertions.assertFalse(actual);
    }

    @Test
    public void epicMatchesTest1() {
        Epic epic = new Epic(5, new String[]{"Перезвонить родителям"});

        boolean actual = epic.matches("Перезвонить");

        Assertions.assertTrue(actual);
    }

    @Test
    public void epicMatchesTest2() {
        Epic epic = new Epic(5, new String[]{"Перезвонить родителям"});

        boolean actual = epic.matches("Ответить");

        Assertions.assertFalse(actual);
    }

    @Test
    public void meetingMatchesTest1() {
        Meeting meeting = new Meeting(5, "Инновации", "Технологии будущего", "01.09.2023 09:30");

        boolean actual = meeting.matches("Инновации");

        Assertions.assertTrue(actual);
    }

    @Test
    public void meetingMatchesTest2() {
        Meeting meeting = new Meeting(5, "Инновации", "Технологии будущего", "01.09.2023 09:30");

        boolean actual = meeting.matches("Проект");

        Assertions.assertFalse(actual);
    }

    @Test
    public void meetingMatchesTest3() {
        Meeting meeting = new Meeting(5, "Инновации", "Технологии будущего", "01.09.2023 09:30");

        boolean actual = meeting.matches("Технологии");

        Assertions.assertTrue(actual);
    }
}
