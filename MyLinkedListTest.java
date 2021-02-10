package bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode)
                         && myLinkedList.head.getNext().equals(mySecondNode)
                         && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAppendedShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode)
                         && myLinkedList.head.getNext().equals(mySecondNode)
                         && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode)
                         && myLinkedList.head.getNext().equals(mySecondNode)
                         && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstElementWhenDeletedShouldPassLinkedListResult(){
        MyNode<Integer>myFirstNode=new MyNode<>(56);
        MyNode<Integer>mySecondNode=new MyNode<>(30);
        MyNode<Integer>myThirdNode=new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode)
                         && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.popLast();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode)
                         && myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);

    }

    @Test
    public void given3NumberSearchForValueShouldPassResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        INode<Integer> searchNode;
        searchNode = myLinkedList.search(mySecondNode);
        Assert.assertEquals(mySecondNode, searchNode);
    }

    @Test
    public void givenLinkedListWhenInsertNumberNodeShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> newNode = new MyNode<>(40);
        MyLinkedList<MyNode<Integer>> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.insert(mySecondNode, newNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode)
                         && myLinkedList.head.getNext().equals(mySecondNode)
                         && myLinkedList.tail.equals(myFirstNode) && mySecondNode.getNext().equals(newNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given4NumbersWhenDeleteMiddleNumberShouldPassResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.deleteMiddleElement(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode)
                         && myLinkedList.head.getNext().equals(mySecondNode);
        myLinkedList.tail.equals(myFourthNode);
        Assert.assertTrue(result);
    }
}
