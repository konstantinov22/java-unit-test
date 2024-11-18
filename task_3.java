import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // Аннотация для параметризованного теста
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    // Конструктор для инициализации полей
    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters // Аннотация для метода, предоставляющего параметры
    public static Object[][] getTextData() {
        return new Object[][] {
            {17, false},
        {18, true},
        {20, true},
        {21, true}
    };
}

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        // Передаём возраст пользователя
        boolean isAdult = program.checkIsAdult(age);
        // Сравниваем полученный и ожидаемый результаты
        assertEquals("Ошибка при проверке возраста: " + age, result, isAdult);
    }
}
