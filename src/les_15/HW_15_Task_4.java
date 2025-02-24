package les_15;

import java.util.Random;

public class HW_15_Task_4 {
    public static void main(String[] args) {

        Random random = new Random();

        int grade = random.nextInt(13);

        int tvTime = 45;

        System.out.println("Оценка ребёнка по математике: " + grade);

        switch (grade) {
            case 10:
            case 11:
            case 12:
                System.out.println("Как я рад(а) !");
                tvTime += 60;
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Молодец!");
                tvTime += 45;
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Нормально");
                tvTime += 15;
                break;
            case 3:
                System.out.println("Я огорчён(а)");
                tvTime -= 30;
                break;
            case 0:
            case 1:
            case 2:
                System.out.println("Сегодня телевизор не смотришь.");
                tvTime = 0;
                break;
        }

        if (tvTime > 60) {
            tvTime = 60;
        }
        System.out.println("Оставшееся время для просмотра ТВ: " + tvTime);
    }
}
