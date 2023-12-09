public class PopCount {
    public int eggCount(int number) {
        if (number == 0)
            return 0;
        else
            // if last bit set add 1 else add 0
            return (number & 1) + eggCount(number >> 1);
    }
}
