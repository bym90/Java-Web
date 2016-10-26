<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDJyqdb8LENaY4ZVBytETkTAVPt0Rrpkos&sensor=false"></script>

<body>
	<div id="map" style="width: 500px; height: 500px;"></div>
	<script type="text/javascript">
    var locations = [
			['구로구 구로1동 지점', 37.4929862, 126.8757043, 19    ],
			['구로구 구로2동 지점', 37.4912925, 126.8834535, 24    ],
			['구로구 구로3동 지점', 37.4859324, 126.8932857, 24    ],
			['구로구 구로4동 지점', 37.4855983, 126.8866194, 32    ],
			['영등포구 여의도동 지점', 37.5285732, 126.9289741, 18 ],
			['영등포구 당산동 지점', 37.5340278, 126.9019901, 21   ],
			['영등포구 신길동 지점', 37.5062485, 126.9139521, 41   ],
			['영등포구 양평동 지점', 37.5390834, 126.888352, 10    ],
			['동작구 노량진동 지점', 37.5110026, 126.9416329, 33   ],
			['동작구 상도동 지점', 37.4989895, 126.9377193, 62     ],
			['동작구 사당동 지점', 37.4862548, 126.9733325, 49     ],
			['동작구 흑석동 지점', 37.5094857, 126.9605285, 31     ],
			['마포구 대흥동 지점', 37.5559517, 126.9426399, 54     ],
			['마포구 용문동 지점', 37.5383431, 126.9584999, 24     ],
			['마포구 망원동 지점', 37.5559772, 126.9012821, 17     ],
			['마포구 합정동 지점', 37.5494248, 126.9056717, 15     ]
   		];
   
    var map = new google.maps.Map(document.getElementById('map'), {
      zoom: 12,
      center: new google.maps.LatLng(37.521415, 126.924352),
      mapTypeId: google.maps.MapTypeId.ROADMAP
    });
    var infowindow = new google.maps.InfoWindow();
    var marker, i;
    for (i = 0; i < locations.length; i++) {  
        marker = new google.maps.Marker({
        position: new google.maps.LatLng(locations[i][1], locations[i][2]),
        map: map
      });
      google.maps.event.addListener(marker, 'click', (function(marker, i) {
        return function() {
          infowindow.setContent(locations[i][0]);
          infowindow.open(map, marker);
          var returnValue = confirm("선택하시겠습니까?");
        }
      })(marker, i));
    }
  </script>


</body>
</html>