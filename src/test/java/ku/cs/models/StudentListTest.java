package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มนิสิต")
    void testAddNewStudent(){
        StudentList list = new StudentList();
        list.addNewStudent("6610450001","StudentTest1");
        list.addNewStudent("6610450002","StudentTest2",90);
        list.addNewStudent("6610450003","StudentTest3",100);
        assertEquals(3, list.getStudents().size());

    }

    @Test
    @DisplayName("ทดสอบการค้นหานิสิต")
    void testFindStudentById(){
        StudentList list = new StudentList();
        list.addNewStudent("6610450001","StudentTest1");
        list.addNewStudent("6610450002","StudentTest2",90);
        list.addNewStudent("6610450003","StudentTest3",100);

        assertEquals("6610450003", list.findStudentById("6610450003").getId());

    }
    @Test
    @DisplayName("ทดสอบการให้คะแนนด้วย id")
    void testGiveScoreToId(){
        StudentList list = new StudentList();
        list.addNewStudent("6610450001","StudentTest1");
        list.addNewStudent("6610450002","StudentTest2",90);
        list.addNewStudent("6610450003","StudentTest3",100);
        list.giveScoreToId("6610450001",80);
        assertEquals(80,list.findStudentById("6610450001").getScore() );

    }
    @Test
    @DisplayName("ทดสอบการดูเกรดด้วย id")
    void testViewGradeOfId(){
        StudentList list = new StudentList();
        list.addNewStudent("6610450001","StudentTest1");
        list.addNewStudent("6610450002","StudentTest2",90);
        list.addNewStudent("6610450003","StudentTest3",100);

        assertEquals("A",list.findStudentById("6610450002").grade() );
    }

}