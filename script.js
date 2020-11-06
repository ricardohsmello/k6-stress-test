import http from 'k6/http';
import { check, sleep } from 'k6';
export default function () {
  console.log('###### running k6 #######')
  
  let res = http.get('http://localhost:8080/read/' + __ENV.TOTAL);
  check(res, { 'status was 200': (r) => r.status == 200 });
  sleep(1);
}
