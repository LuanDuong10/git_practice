package ThuatToan1;

public class VeryComplexService {
    private SortAlgorithm sortAlgorithm;

    public VeryComplexService( SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }

    public void complexBusiness(int arr[]){
        sortAlgorithm.sort(arr);
    }

    public static void main(String[] args) {
        SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        SortAlgorithm quickSortAlgorithm = new QuicksortAlgorithm();
        VeryComplexService business1 = new VeryComplexService(bubbleSortAlgorithm);
        VeryComplexService business2 = new VeryComplexService(quickSortAlgorithm);
    }
}
