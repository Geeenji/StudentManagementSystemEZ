package com.tengfei.test;

import com.tengfei.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //menu

        Scanner sc = new Scanner(System.in);
        //创建集合容器对象
        ArrayList<Student> list = new ArrayList<>();
        lo:
        //循环标号
        while (true) {
            System.out.println("----Student Management System----");
            System.out.println("1 Add a student");
            System.out.println("2 Delete a student");
            System.out.println("3 Correct a student");
            System.out.println("4 find a student");
            System.out.println("5 Exit");
            System.out.println("Choose your number:");

            String choice = sc.next();
            switch (choice) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
//                    System.out.println("Delete a student");
                    deleteStudent(list);
                    break;
                case "3":
//                    System.out.println("Correct a student");
                    correctStudent(list);
                    break;
                case "4":
//                    System.out.println("find a student");

                    break;
                case "5":
                    queryStudent(list);
                    break;
                case "6":
                    System.out.println("Exit, Bye");
                    break lo;
                default:
                    System.out.println("Wrong input, please try again");
                    break;
            }
        }

    }

    private static void deleteStudent(ArrayList<Student> list) {
//  1. give prompt information
        System.out.println("Input the Id to be deleted");
//    2. accept student id to be deleted
        Scanner sc = new Scanner(System.in);
        String ds = sc.next();
//    3. use method getIndex, check the location of the the student id in arraylist
        int index = getIndex(list, ds);
//    4. delete info according to sId
        if (index == -1) {
            System.out.println("No such student");
        } else {
            list.remove(index);
            System.out.println("Delete Success " + ds);
        }

    }

    private static void queryStudent(ArrayList<Student> list) {
        //1 Determine whether there is data in the collection
        //2 If exist, show the head student data
        //3 print
        if (list.size() == 0) {
            System.out.println("no information of the student");
            return;
        }
        System.out.println("id\tname\tage\tbirthday");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthDay());

        }

    }

    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //1. input info
        //2. encapsulate info as Student Object
        //3. add encapsulated Student Object to container
        //4. give hint when success

//        for (int i = 0; i < list.size(); i++) {
//            Student ss = list.get(i);
//            if (ss.getId().equals(id)) {
//                System.out.println("The Id has already existed, please add again");
//                return;
//            }
//        }
        String id;
        while (true) {
            System.out.println("Input a student id:");
            id = sc.next();
            int index = getIndex(list, id);
            if (index == -1) break;
        }
        System.out.println("Input a name:");
        String name = sc.next();
        System.out.println("Input age;");
        int age = sc.nextInt();
        System.out.println("Input birthday:");
        String birthday = sc.next();
        Student sd = new Student(id, name, age, birthday);
        list.add(sd);
        System.out.println("Add succeed");
    }

    private static int getIndex(ArrayList<Student> list, String sid) {
        //1. assume the sid doesn't exist
        int index = -1;
        //2 travrse the set
        for (int i = 0; i < list.size(); i++) {
            //get id of each student
            Student stu = list.get(i);
            String pid = stu.getId();
            if (sid.equals(pid)) {
                index = i;
            }
        }
        return index;
    }

    private static void correctStudent(ArrayList<Student> list) {
        System.out.println("Please input the Id: ");
        Scanner sc = new Scanner(System.in);
        String cid = sc.next();

        int index = getIndex(list, cid);
        Student student = list.get(index);
        if (index == -1) {
            System.out.println("Could not find");
            return;
        }
        System.out.println("Input new ID: ");
        String id2 = sc.next();
        student.setId(id2);

        System.out.println("Input new Name: ");
        String name2 = sc.next();
        student.setName(name2);

        System.out.println("Input new age: ");
        int age2 = sc.nextInt();
        student.setAge(age2);

        System.out.println("Input Birthday: ");
        String birthday2 = sc.next();
        student.setBirthDay(birthday2);
    }
    private static void findAStudent(ArrayList<Student> list){
        System.out.println("Please Input A Id:");
        Scanner sc=new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list,id);
        if(index==-1){
            System.out.println("No such student");
            return;
        }
        Student stu=list.get(index);
        System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthDay());
    }
}
