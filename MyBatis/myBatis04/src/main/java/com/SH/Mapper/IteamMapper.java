package com.SH.Mapper;

import com.SH.Bean.team;

import java.util.List;

public interface IteamMapper {
    List<team> selectTeam(int team_id);
}
