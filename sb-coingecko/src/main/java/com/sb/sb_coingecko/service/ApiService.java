package com.sb.sb_coingecko.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.sb.sb_coingecko.Model.CoinData;


@Service
public class ApiService {
  @Autowired
  private RestTemplate restTemplate;

 

  public List <CoinData> fetchCoinData(){
    String apiUrl="https://api.coingecko.com/api/v3/coins/markets?x_cg_demo_api_key=CG-XP77sXitxyy1eUzUyuSFSiDr&ids=bitcoin,ethereum,tether&vs_currency=usd";
    CoinData[] response = restTemplate.getForObject(apiUrl, CoinData[].class);
    return Arrays.asList(response);
  }

}
