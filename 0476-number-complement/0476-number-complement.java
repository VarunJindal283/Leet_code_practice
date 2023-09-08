class Solution {
    public int findComplement(int num) {
        int nbit=(int)(Math.log(num)/Math.log(2))+1;
        int mask=(1<<nbit)-1;
        return num^mask;
    }
}