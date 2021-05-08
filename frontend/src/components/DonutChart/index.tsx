import React, {useEffect, useState} from "react";
import axios from 'axios';
import Chart from 'react-apexcharts'
import {SaleSum} from 'types/sale';
import {BASE_URL} from 'utils/requests';


type ChartData = {

    labels: string[];
    series: number[];

}

function DonutChart() {

    const [chartData, setCharData] = useState<ChartData>({labels: [], series: []});

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/amount-by-seller`)
            .then((response) => {
                const data = response.data as SaleSum[];
                const myLabels = data.map(x => x.sellerName);
                const mySeries = data.map(x => x.sum);

                setCharData({labels: myLabels, series: mySeries});
            })
    }, []);


    const options = {
        legend: {
            show: true
        }
    }


    return (
        <Chart
            options={{...options, labels: chartData.labels}}
            series={chartData.series}
            type="donut"
            height="240"
        /> //Adiciona ao options os labels da outra constant (no caso mockData)
    );
}

export default DonutChart;
