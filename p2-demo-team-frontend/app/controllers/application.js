import Controller from '@ember/controller';

export default Controller.extend({
    actions: {
        getCaveById() {
            this.store.findRecord('cave', 1).then((park) => {
                alert(park.get('name') + ' ' + park.get('id'))
            })
        }

    }
});
