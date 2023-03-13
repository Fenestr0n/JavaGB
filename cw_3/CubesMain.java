package cw_3;

import java.util.ArrayList;
import java.util.List;

/*
 * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 * его цвет (красный, желтый, зеленый и т.д.) и материал (деревянный, металлический, картонный и т.д.).
 * Найти:
 * - количество кубиков желтого цвета и их суммарный объем,
 * - количество деревянных кубиков с ребром 3 см.
 */

public class CubesMain {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "желтый", "деревянный");
        Cube cube2 = new Cube(3, "зеленый", "металлический");
        Cube cube3 = new Cube(4, "красный", "картонный");
        Cube cube4 = new Cube(2, "желтый", "стальной");

        List<Cube> cubesList = new ArrayList<>();
        cubesList.add(cube1);
        cubesList.add(cube2);
        cubesList.add(cube3);
        cubesList.add(cube4);

        Integer k = 0;
        Integer volume = 0;
        Integer kWood = 0;
        for (int i = 0; i < cubesList.size(); i++) {
            Cube cube = cubesList.get(i);
            if (cube.getColor().equals("желтый")) {
                k++;
                volume += volumeCube(cubesList.get(i).getSize());
            }
            if ((cube.getMaterial().equals("деревянный") && (cube.getSize() == 3))) {
                kWood++;
            }
        }
        System.out.println(k + " кубиков желтого цвета и их суммарный объем " + volume);
        System.out.println(kWood + " деревянных кубика с ребром 3 см");
    }

    private static Integer volumeCube(Integer size) {
        return size * size * size;
    }
}
