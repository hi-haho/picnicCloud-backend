import { createApp } from 'vue';
import App from './App.vue';
import router from './router'; // 라우터를 사용하는 경우

createApp(App)
  .use(router) // 라우터를 사용하는 경우
  .mount('#app');