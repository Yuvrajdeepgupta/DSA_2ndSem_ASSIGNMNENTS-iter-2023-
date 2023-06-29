import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
}

public class PROG_1A {
    public static Scanner sc = new Scanner(System.in);

    public static void create(Node start) 
    {
        Node temp, newnode;
        int regd_no;
        float mark;
        temp = start;
        System.out.print("Enter student registration number (0 to stop): ");
        regd_no = sc.nextInt();
        while (regd_no != 0) {
            newnode = new Node();
            newnode.regd_no = regd_no;
            System.out.print("Enter mark secured: ");
            newnode.mark = sc.nextFloat();
            //newnode.next = null;

            if (start == null) {
                start = newnode;
                temp = start;
            } else {
                temp.next = newnode;
                temp = temp.next;
            }

            System.out.print("Enter student registration number (0 to stop): ");
            regd_no = sc.nextInt();
        }
    }

    public static void display(Node start) {
        Node temp = start;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Student Information:");
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + "\tMark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static Node InsBeg(Node start) {
        Node newnode = new Node();
        System.out.print("Enter student registration number: ");
        newnode.regd_no = sc.nextInt();
        System.out.print("Enter mark secured: ");
        newnode.mark = sc.nextFloat();
        newnode.next = start;
        start = newnode;
        return start;
    }

    public static Node InsEnd(Node start) {
        Node temp, newnode;
        temp = start;
        newnode = new Node();
        System.out.print("Enter student registration number: ");
        newnode.regd_no = sc.nextInt();
        System.out.print("Enter mark secured: ");
        newnode.mark = sc.nextFloat();
        newnode.next = null;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return start;
    }

    public static Node InsAny(Node start) {
        Node temp, newnode;
        int pos, i;
        temp = start;
        newnode = new Node();
        System.out.print("Enter student registration number: ");
        newnode.regd_no = sc.nextInt();
        System.out.print("Enter mark secured: ");
        newnode.mark = sc.nextFloat();
        newnode.next = null;
        System.out.print("Enter the position to insert: ");
        pos = sc.nextInt();
        if (pos == 1) {
            newnode.next = start;
            start = newnode;
            return start;
        }
        for (i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null)
            System.out.println("Invalid position");
        else {
            newnode.next = temp.next;
            temp.next = newnode;
        }
        return start;
    }

    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty");
            return start;
        }
        System.out.println("Deleted element: Regd No - " + start.regd_no + ", Mark - " + start.mark);
        start = start.next;
        return start;
    }

    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty");
            return start;
        }
        if (start.next == null) {
            System.out.println("Deleted element: Regd No - " + start.regd_no + ", Mark - " + start.mark);
            start = null;
            return start;
        }
        Node temp = start;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Deleted element: Regd No - " + temp.next.regd_no + ", Mark - " + temp.next.mark);
        temp.next = null;
        return start;
    }

    public static Node DelAny(Node start) {
        Node temp, prev;
        int regd_no;
        System.out.print("Enter the student registration number to delete: ");
        regd_no = sc.nextInt();
        if (start == null) {
            System.out.println("List is empty");
            return start;
        }
        if (start.regd_no == regd_no) {
            System.out.println("Deleted element: Regd No - " + start.regd_no + ", Mark - " + start.mark);
            start = start.next;
            return start;
        }
        temp = start;
        prev = null;
        while (temp != null && temp.regd_no != regd_no) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element not found");
            return start;
        }
        System.out.println("Deleted element: Regd No - " + temp.regd_no + ", Mark - " + temp.mark);
        prev.next = temp.next;
        return start;
    }

    public static void search(Node start) {
        Node temp = start;
        int regd_no;
        float newMark;
        System.out.print("Enter the student registration number to search: ");
        regd_no = sc.nextInt();
        while (temp != null && temp.regd_no != regd_no) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element not found");
        } else {
            System.out.println("Current Mark: " + temp.mark);
            System.out.print("Enter new mark: ");
            newMark = sc.nextFloat();
            temp.mark = newMark;
            System.out.println("Mark updated successfully");
        }
    }

    public static void sort(Node start) {
        Node i, j;
        float tempMark;
        int tempRegdNo;
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        for (i = start; i != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.mark < j.mark) {
                    tempMark = i.mark;
                    i.mark = j.mark;
                    j.mark = tempMark;

                    tempRegdNo = i.regd_no;
                    i.regd_no = j.regd_no;
                    j.regd_no = tempRegdNo;
                }
            }
        }
        System.out.println("List sorted in descending order of marks");
    }

    public static int count(Node start) {
        Node temp = start;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node reverse(Node start) {
        Node prev = null;
        Node current = start;
        Node nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        start = prev;
        System.out.println("List reversed successfully");
        return start;
    }

    public static void main(String[] args) {
        Node start = null;
        int choice;
        while (true) {
            System.out.println("****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at the beginning");
            System.out.println("4: Insert at the end");
            System.out.println("5: Insert at any position");
            System.out.println("6: Delete from the beginning");
            System.out.println("7: Delete from the end");
            System.out.println("8: Delete from any position");
            System.out.println("9: Search and update mark");
            System.out.println("10: Sort based on marks");
            System.out.println("11: Count number of nodes");
            System.out.println("12: Reverse the list");
            System.out.println("Enter the choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    start = new Node();
                    create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = InsBeg(start);
                    break;
                case 4:
                    start = InsEnd(start);
                    break;
                case 5:
                    start = InsAny(start);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    start = DelAny(start);
                    break;
                case 9:
                    search(start);
                    break;
                case 10:
                    sort(start);
                    break;
                case 11:
                    System.out.println("Number of nodes: " + count(start));
                    break;
                case 12:
                    start = reverse(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
