package nextstep.subway.line.application.dto.response;

import lombok.Getter;
import nextstep.subway.station.applicaion.dto.response.StationResponse;

import java.util.List;

@Getter
public class LineResponse {
    private Long id;
    private String name;
    private String color;
    private List<StationResponse> stations;

    public LineResponse(Long id, String name, String color, List<StationResponse> stations) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.stations = stations;
    }
}
