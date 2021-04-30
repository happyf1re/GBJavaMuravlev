package Lesson_02.DZ;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        String[][] ar = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "1", "11", "12"}, {"1", "2", "1", "16"}};
        String[][] error1 = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "1"}, {"1", "2", "1", "16"}};
        String[][] error2 = new String[][]{{"1", "2", "3", "4"}, {"asd", "1", "7", "8"}, {"9", "1", "2", "12"}, {"1", "2", "3", "16"}};

        try {
            System.out.println("Пример корректного вывода суммы без ошибок: ");
            aa(ar);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            aa(error1);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            aa(error2);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static void aa(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length == 4 && arr[0].length == 4 && arr[1].length == 4 && arr[2].length == 4 && arr[3].length == 4) {
            int result = 0;

            for(int i = 0; i < arr.length; ++i) {
                for(int j = 0; j < arr[i].length; ++j) {
                    try {
                        result += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }

            System.out.println("Сумма сложения элементов массива = " + result);
        } else {
            throw new MyArraySizeException();
        }
    }
}

