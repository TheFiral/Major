package sutd;

import java.nio.charset.StandardCharsets;

public enum Question {

    Q_ONE("В АС работает один пользователь, допущенный ко всей информации АС, размещенной на носителях одного уровня конфиденциальности?"),
    Q_ONE_ONE("Есть ли информация составляющая гостайну?"),
    Q_TWO("В АС пользователи имеют одинаковые права доступа (полномочия) ко всей информации АС, обрабатываемой и (или) хранимой на носителях различного уровня конфиденциальности"),
    Q_TWO_ONE("Есть ли информация составляющая гостайну?"),
    Q_THREE("Есть ли информация составляющая секретную информацию с грифом не выше секретно?"),
    Q_THREE_TWO("Есть ли информация составляющая секретную информацию с грифом совершенно секретно?"),
    Q_THREE_FOUR("Есть ли информация составляющая секретную информацию с грифом особой важности?"),
    Q_THREE_SIX("Есть ли информация составляющая служебную тайну?");

    Question(String value) {
        this.value = new String(value.getBytes(StandardCharsets.UTF_8));
    }

    private final String value;

    public String getValue() {
        return value;
    }
}