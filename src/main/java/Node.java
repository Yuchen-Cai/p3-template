

public abstract class Node<V> implements Runnable {
    /**
     * Send message to `this` node
     * This method should be called by other nodes.
     */
    public abstract void sendMessage(V value);
}
