package com.suraj.train.labFour.exThree.item.mediaItem;

import java.util.Objects;

abstract public class MediaItem {
    private int runtime;

    @Override
    public String toString() {
        return "MediaItem{" +
                "runtime=" + runtime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MediaItem)) return false;
        MediaItem mediaItem = (MediaItem) o;
        return getRuntime() == mediaItem.getRuntime();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRuntime());
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public MediaItem(int runtime) {
        this.runtime = runtime;
    }
}
