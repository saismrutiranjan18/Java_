public class modularExpo {
        public static void main(String[] args) {
            int base = 2;
            int exponent = 10;
            int modulus = 1000;
            System.out.println(modExp(base, exponent, modulus)); // Output should be 24
        }
    
        public static int modExp(int base, int exponent, int modulus) {
            if (modulus == 1) return 0;
            int result = 1;
            base = base % modulus;
            while (exponent > 0) {
                // If exponent is odd, multiply base with result
                if ((exponent & 1) == 1) {
                    result = (result * base) % modulus;
                }
                // Exponent must be even now
                exponent = exponent >> 1; // Divide exponent by 2
                base = (base * base) % modulus; // Square the base
            }
            return result;
    }
}
