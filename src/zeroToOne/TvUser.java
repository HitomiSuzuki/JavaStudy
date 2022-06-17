package zeroToOne;

public class TvUser {
    public static void main(String[] args) {
        Television tokaiTv = new Television(1, "東海テレビ");
        Television cbcTv = new Television(5, "CBCテレビ");
        tokaiTv.showStartOfBroadcasting();
        cbcTv.showStartOfBroadcasting();
        tokaiTv.showEndOfBroadcasting();
        cbcTv.showEndOfBroadcasting();
    }
}

class Television {
    int channelNo;
    String broadcastStationName;

    public Television(int channelNo, String broadcastStationName) {
        this.channelNo = channelNo;
        this.broadcastStationName = broadcastStationName;
    }

    public void showStartOfBroadcasting() {
        System.out.printf("START: %d チャンネルの %s が放送開始します。%n", this.channelNo, this.broadcastStationName);
    }

    public void showEndOfBroadcasting() {
        System.out.printf("END: %d チャンネルの %s が放送終了します。%n", this.channelNo, this.broadcastStationName);
    }
}