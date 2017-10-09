<template>
  <div id="outer">
    <div id="inner">

      <b-card title="Login" img-src="http://worldmaritimenews.com/wp-content/uploads/2012/12/EU-to-Co-Finance-Swedish-Finnish-Maritime-Suggestion.jpg" img-alt="Image" img-top tag="article" style="max-width: 20rem;" class="mb-2">
        <p class="card-text">

          <b-form @submit="onSubmit">
            <b-form-group id="exampleInputGroup1" label="Username:" label-for="exampleInput1">
              <b-form-input id="exampleInput1" type="username" v-model="form.username" required placeholder="Enter username"></b-form-input>
            </b-form-group>
            <b-form-group id="exampleInputGroup2" label="Password:" label-for="exampleInput2">
              <b-form-input id="exampleInput2" type="password" v-model="form.password" required placeholder="Enter password"></b-form-input>
            </b-form-group>
            <b-button type="submit" variant="primary">Login</b-button>

            <router-link to="/register">
              <b-button type="reset" variant="secondary">Register</b-button>
            </router-link>
          </b-form>

        </p>
      </b-card>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      form: {
        username: '',
        password: ''
      }
    }
  },

  methods: {
    onSubmit(evt) {
      evt.preventDefault();
      alert(JSON.stringify(this.form));
    }
  }
};
</script>

<style scoped>
#inner {
  width: 500px;
  height: 600px;

  position: absolute;
  /*it can be fixed too*/
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  margin: auto;

  /*this to solve "the content will not be cut when the window is smaller than the content": */
  max-width: 100%;
  max-height: 100%;
  overflow: auto;
}
</style>