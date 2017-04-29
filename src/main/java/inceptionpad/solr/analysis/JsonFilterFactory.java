package inceptionpad.solr.analysis;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.util.TokenFilterFactory;
import java.util.Map;

/**
 * Created by fanjiaqi on 4/27/17.
 */
public class JsonFilterFactory extends TokenFilterFactory {

    /**
     * Initialize this factory via a set of key-value pairs.
     *
     * @param args
     */
    public JsonFilterFactory(Map<String, String> args) {
        super(args);
    }

    public TokenStream create(TokenStream tokenStream) {
        return new JsonFilter(tokenStream);
    }
}
