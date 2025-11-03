import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в театр!");
        System.out.println();

        Actor actor1 = new Actor("Киану", "Ривз", Gender.MALE, 186);
        Actor actor2 = new Actor("Райан", "Гослинг", Gender.MALE, 184);
        Actor actor3 = new Actor("Ана", "ДеАрмас", Gender.FEMALE, 168);

        Director director1 = new Director("Квентин", "Тарантино", Gender.MALE, 9);
        Director director2 = new Director("Кристофер","Нолан", Gender.MALE, 12);

        String musicAuthor = "Лана Дель Рей";
        String choreographer = "Мигель";

        //каверы-постановки голивудских фильмов для театра(3шт)
        ArrayList<Actor> dramaActors = new ArrayList<>();
        Show drama = new Show("Помни", 113, director2);

        ArrayList<Actor> operaActors = new ArrayList<>();
        Opera opera = new Opera("Ла-Ла Ленд", 128, director2, operaActors, musicAuthor,
                "В центре Лос-Анджелеса, где мечты и пробки сплетаются в танец,\n" +
                "Миа — актриса, ищущая свой первый шанс.\n" +
                "Себастьян — пианист, хранитель джаза,\n" +
                "играет для тех, кто не слышит своего сердца.", 50);

        ArrayList<Actor> balletActors = new ArrayList<>();
        Ballet ballet = new Ballet("Балерина", 125, director1, balletActors, musicAuthor,
                "Старый театр встречает новую ученицу.\n" +
                        "Руни — балерина, выросшая среди строгих наставников и зеркал,\n" +
                        "где каждое движение должно быть совершенным.\n" +
                        "Она живёт танцем — в нем ее путь и сила." , choreographer);

        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor3);
        ballet.addActor(actor1);

        //Выводим информацию
        System.out.println("Состав спектакля: " + drama.getTitle());
        System.out.print("Режиссер: "); drama.printDirectorInfo();
        System.out.print("Актеры: ");
        System.out.println();
        drama.printActors();
        System.out.println("--".repeat(40));

        System.out.println("Cостав оперы: " +opera.getTitle() + " - ");
        System.out.print("Режиссер: "); opera.printDirectorInfo();
        System.out.print("Автор музыки: "); opera.printMusicAuthor();
        System.out.print("Актеры: ");
        System.out.println();
        opera.printActors();
        System.out.println("--".repeat(40));

        System.out.println("Состав балета: " + ballet.getTitle() + " - ");
        System.out.print("Режиссер: "); ballet.printDirectorInfo();
        System.out.print("Автор музыки: "); ballet.printMusicAuthor();
        System.out.print("Хореограф: "); ballet.printChoreographer();
        System.out.print("Актеры: ");
        System.out.println();
        ballet.printActors();
        System.out.println("--".repeat(40));

        //Меняем актеров
        System.out.println("Замена актера в спектакле: " +drama.getTitle());
        drama.replaceActor(actor3, "Гослинг");
        System.out.println("Новый список актеров:");
        drama.printActors();
        System.out.println("--".repeat(40));

        System.out.println("Пробуем заменить несуществующего актера:");
        opera.replaceActor(actor2, "Дикаприо");
        System.out.println("--".repeat(40));

        //Выводим либретто
        System.out.println("Либретто оперы " + opera.getTitle());
        opera.printLibretto();
        System.out.println("--".repeat(40));

        System.out.println("Либретто балета " + ballet.getTitle());
        ballet.printLibretto();
        System.out.println("--".repeat(40));

        System.out.println("Театр закрывается!");
    }
}
