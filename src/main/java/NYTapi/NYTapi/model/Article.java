package NYTapi.NYTapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.attribute.standard.Media;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Article {

    private Long id;
    private String url;
    private String section;
    private String subsection;
    private String byline;
    private String title;

    @JsonProperty("abstract")
    private String summary;

    private List<Media> media;
    private String imageUrl;
}
