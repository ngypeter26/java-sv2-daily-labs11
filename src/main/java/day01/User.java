package day01;

public interface User {
    // alapértezlemezetten minden pőublikus és absztarkt metódus
    // az interface a képességek/metódusok csoportosítása
    // minden metódusa absztrakt
    // többszörösen öröklődhet

    String getUserEmail();

    String getPassword();

}
