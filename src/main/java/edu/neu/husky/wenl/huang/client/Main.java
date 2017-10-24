package edu.neu.husky.wenl.huang.client;

class Main {
    static final String DOMAIN = "http://localhost:8080";
    static final String CLIENT_DIR = "src/main/java/edu/neu/husky/wenl/huang/client/";
    private static final int DAY_NUM = 1;
    private static final int N_THREADS_WRITER = 100;
    private static final int N_THREADS_READER = 100;
    private static final int SKIER_ID_RANGE = 40000;

    public static void main(String[] args) {
        LiftRecordsWriter.write(N_THREADS_WRITER);
        SkiRecordsGenerator.generate(DAY_NUM);
        DailySkiRecordsReader.read(N_THREADS_READER, DAY_NUM, SKIER_ID_RANGE);
    }
}