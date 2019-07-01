package com.kgc.u2.JDBC.work;


import com.kgc.u2.JDBC.work.Book;
import com.kgc.u2.JDBC.work.BookDAO;
import java.sql.SQLException;
import java.util.List;

public class Test {

    @org.junit.Test
    public void testBooks() throws SQLException {
        BookDAO bookDAO=new BookDAO();

        /*books修改
        Book book=new Book(3,"西游记","罗贯中",30);
        bookDAO.update(book,5);*/

        /*books删除
        bookDAO.delete(3);*/

        /*books查询
        List<Book> bookList= bookDAO.query();
        System.out.println(bookList);*/

        /*books添加
        Book book=new Book(5,"三体","刘慈欣",5);
        bookDAO.add(book);
        */
    }

    @org.junit.Test
    public void testDog() throws SQLException {
        DogDAO dogDAO=new DogDAO();
        /*//dog添加
        Dog dog=new Dog(5,"牧羊犬","黑色",6);
        dogDAO.add(dog);*/

        /*//dog修改
        Dog dog=new Dog(1,"aaa","sss",50);
        dogDAO.update(dog,1);*/

        //dog删除
        dogDAO.delete(2);

        /*//dog查询
        List<Dog> dogList = dogDAO.query();
        System.out.println(dogList);
        */
    }

    @org.junit.Test
    public void testStudent() throws SQLException {
        Student student=new Student(5,"张三","男","北京");
        StudentDAO studentDAO=new StudentDAO();
        studentDAO.add(student);
    }

    @org.junit.Test
    public void testWares() throws SQLException {
        Wares wares=new Wares(6,"a","sss",8000.00);
        WaresDAO waresDAO=new WaresDAO();
        List<Wares> waresList = waresDAO.query();
        System.out.println(waresList);
    }
}
