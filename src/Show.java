import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    //Метод печатает список всех актеров
    public void printActors() {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    //Метод печатает информацию о режиссере
    public void printDirectorInfo() {
        if (director == null) {
            System.out.println("Режиссер не назначен.");
        } else {
            System.out.println(director);
        }
    }

    //Метод на добавление
    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Невозможно добавить пустого актера.");
            return;
        }
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть - " + actor);
            return;
        }
        listOfActors.add(actor);
        //System.out.println("Актер добавлен " + actor);
    }

    // Метод на замену
    public void replaceActor(Actor newActor, String surnameToReplace) {
        if (newActor == null || surnameToReplace == null) {
            System.out.println("Неправильные данные для замены");
            return;
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor existing = listOfActors.get(i);
            if (surnameToReplace.equals(existing.getSurname())) {
                listOfActors.set(i, newActor);
                System.out.println("Актер " + existing + " заменен на " + newActor);
                return;
            }
        }
        System.out.println("Актер с фамилией " + surnameToReplace + " не найден.");
    }

    //Ниже сеттеры - геттеры
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return Collections.unmodifiableList(listOfActors);
    }
}

