public class Sign
{
    private String message;
    private int lineWidth;

    public Sign(String message, int lineWidth)
    {
        this.message = message;
        this.lineWidth = lineWidth;
    }

    public int numberOfLines()
    {
        int lines = message.length() / lineWidth;

        if(message.length() % lineWidth > 0)
            lines++;

        return lines;
    }

    public String getLines()
    {
        if(message.length() == 0)
            return null;

        String lines = "";
        String messageRemaining = message;

        while(messageRemaining.length() > lineWidth)
        {
            lines += messageRemaining.substring(0, lineWidth);
            lines += ";";
            messageRemaining = messageRemaining.substring(lineWidth);
        }

        lines += messageRemaining;

        return lines;
    }
}