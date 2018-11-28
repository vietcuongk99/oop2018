package week12;

public class Task2 {
  private Sort sort;
    public Task2(Sort sort) {
        this.sort = sort;
    }

    public void Todo(int a[]) {
         sort.Sort(a);
    }

    public interface Sort {
        public void Sort(int a[]);
    }
    public static class SelectedSort implements Sort {
        public static void swap(int a[], int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        public void Sort(int a[]) {

            for(int i = 0; i<a.length-1; i++) {
                int min = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[min]) {
                        min = j;
                    }
                }
                    swap(a,i,min);
            }
            System.out.println("Selected Sort");
            for(int i = 0; i <a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }

    public static class BubbleSort implements Sort {
        public static void swap(int a[], int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
         public void Sort(int a[]) {
             for(int i = 0; i<a.length-1; i++) {
                 for (int j = i+1; j < a.length; j++) {
                     if (a[i] > a[j]) {
                         swap(a, i, j);
                     }
                 }
             }
             System.out.println("Bubble Sort");
             for(int i = 0; i <a.length; i++) {
                 System.out.println(a[i]);
             }
         }
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,1,0,-9,-8};

        Task2 t1 = new Task2(new SelectedSort());
        Task2 t2 = new Task2(new BubbleSort());

        t1.Todo(a);
        t2.Todo(a);


    }

}
