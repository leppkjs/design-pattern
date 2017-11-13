package builder;

public class TextBuilder extends Builder {
    private StringBuilder build = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        build.append("=======================================\n");
        build.append("『").append(title).append("』");
        build.append("\n");
    }

    @Override
    public void makeString(String str) {
        build.append("▣").append( str ).append("\n");
        build.append("\n");
    }

    @Override
    public void makeIems(String[] items) {
        for(String item : items) {
            build.append("⊙").append(item).append("\n");
        }
        build.append("\n");
    }

    @Override
    public void close() {
        build.append("=======================================\n");
    }

    public String getResult() {
        return build.toString();
    }
}
