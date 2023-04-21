public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;
    private int stationQuantity = 10;

    public Radio(int stationQuantity) {
        this.stationQuantity = stationQuantity;
        this.maxStation = stationQuantity - 1;
        this.minStation = 0;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getStationQuantity() {
        return stationQuantity;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        volume = newVolume;
    }

    public int nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
        return currentStation;
    }

    public int previousStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
        return currentStation;
    }

    public int increaseVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        } else {
            volume = maxVolume;
        }
        return volume;
    }

    public int decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
        return volume;
    }
    
}
