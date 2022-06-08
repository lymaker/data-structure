package icu.agony.ds.linear;

import icu.agony.ds.linear.impl.SequenceList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author LiuYun
 * @version 1.0
 */
public class SequenceListTest {

    private final SequenceList<Integer> sequenceList = new SequenceList<>(6);

    @BeforeEach
    public void before() {
        sequenceList.add(1);
        sequenceList.add(2);
        sequenceList.add(3);
        sequenceList.add(4);
        sequenceList.add(5);
    }

    @Test
    public void clearTest() {
        sequenceList.clear();
    }

    @Test
    public void isEmptyTest() {
        Assertions.assertFalse(sequenceList.isEmpty());
    }

    @Test
    public void lengthTest() {
        Assertions.assertEquals(sequenceList.length(), 5);
    }

    @Test
    public void addTest() {
        sequenceList.add(6);
    }

    @Test
    public void getTest() {
        Assertions.assertEquals(sequenceList.get(1), 2);
    }

    @Test
    public void insertTest() {
        sequenceList.insert(2, 2);
    }

    @Test
    public void removeTest() {
        sequenceList.remove(2);
    }

    @Test
    public void indexOfTest() {
        Assertions.assertEquals(sequenceList.indexOf(1), 0);
        Assertions.assertEquals(sequenceList.indexOf(2), 1);
        // Error: Expected: 2, Actual: 1
        // Assertions.assertEquals(sequenceList.indexOf(3), 1);
    }

    @AfterEach
    public void after() {
        sequenceList.display();
    }
}
