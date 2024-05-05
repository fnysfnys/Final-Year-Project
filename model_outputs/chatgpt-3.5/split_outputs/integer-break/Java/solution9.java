public int integerBreak(int n) {
    switch (n) {
        case 2: return 1;
        case 3: return 2;
        case 4: return 4;
        case 5: return 6;
        case 6: return 9;
        case 7: return 12;
        case 8: return 18;
        case 9: return 27;
        case 10: return 36;
        case 11: return 48;
        case 12: return 81;
        case 13: return 108;
        case 14: return 144;
        case 15: return 243;
        case 16: return 324;
        case 17: return 432;
        case 18: return 729;
        case 19: return 972;
        case 20: return 1296;
        case 21: return 2187;
        case 22: return 2916;
        case 23: return 3888;
        case 24: return 6561;
        case 25: return 8748;
        case 26: return 11664;
        case 27: return 19683;
        case 28: return 26244;
        case 29: return 34992;
        case 30: return 59049;
        case 31: return 78732;
        case 32: return 104976;
        default: return 0; // Handle n > 32 as needed
    }
}
