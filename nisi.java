java.util.Random random = new java.util.Random();
while (lotto.size() < 6) {
    int randomNumber = random.nextInt(49) + 1;
    lotto.add(randomNumber);
}
